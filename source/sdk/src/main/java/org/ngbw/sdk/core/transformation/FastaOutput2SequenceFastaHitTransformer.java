/*
 * FastaOutput2SequenceFastaHitTransformer.java
 */
package org.ngbw.sdk.core.transformation;


import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

import org.ngbw.sdk.api.core.GenericDataRecordCollection;
import org.ngbw.sdk.bioutils.fastout.FastaHit;
import org.ngbw.sdk.bioutils.fastout.FastaOutParser;
import org.ngbw.sdk.bioutils.fastout.FastaResult;
import org.ngbw.sdk.core.configuration.ServiceFactory;
import org.ngbw.sdk.core.shared.DatasetId;
import org.ngbw.sdk.core.shared.IndexedDataRecord;
import org.ngbw.sdk.core.types.RecordFieldType;
import org.ngbw.sdk.core.types.RecordType;
import org.ngbw.sdk.database.SourceDocument;


/**
 * 
 * @author Roland H. Niedner
 *
 */
public class FastaOutput2SequenceFastaHitTransformer extends ParseAndSearchTransformer {

	private GenericDataRecordCollection<IndexedDataRecord> dataRecordCollection;
	private FastaResult fastout;
	
	public FastaOutput2SequenceFastaHitTransformer(ServiceFactory serviceFactory,
			SourceDocument srcDocument, RecordType targetType) throws IOException, SQLException {
		super(serviceFactory, srcDocument, targetType);
	}

	@Override
	protected void transform(SourceDocument srcDocument) throws IOException, SQLException {
		if (srcDocument == null)
			throw new NullPointerException("SourceDocument is null!");
		fastout = FastaOutParser.parse(srcDocument.getData());
	}

	public int getTotalDataRecordCount() {
		if (fastout == null)
			throw new NullPointerException("Blast result not initialized is null!");
		if (fastout.hits == null)
			return 0;
		return fastout.hits.size();
	}

	@Override
	public GenericDataRecordCollection<IndexedDataRecord> getDataRecordCollection() throws ParseException {
		if (dataRecordCollection == null || dataRecordCollection.size() < this.getTotalDataRecordCount()) {
			dataRecordCollection = newDataRecordCollection();
			IndexedDataRecord record;
			for (int i=0; i<fastout.hits.size(); i++) {
				FastaHit hit = fastout.hits.get(i);
				DatasetId datasetId = new DatasetId(hit.DATASET, hit.PRIMARY_ID);
				record = newDataRecord(i, findDatasetRecord(datasetId));
				record.getField(RecordFieldType.SCORE).setValue(hit.ZSCORE);
				record.getField(RecordFieldType.E_VALUE).setValue(hit.E_VALUE);
				record.getField(RecordFieldType.DATASET).setValue(datasetId.dataset);
				record.getField(RecordFieldType.QUERY).setValue(fastout.QUERY);
				dataRecordCollection.add(record);
			}
		}
		return dataRecordCollection;
	}

	public GenericDataRecordCollection<IndexedDataRecord> getDataRecordCollection(
			int fromIndex, int toIndex) throws ParseException {
		if (fromIndex >= fastout.hits.size() || toIndex > fastout.hits.size()
				|| fromIndex < 0 || toIndex < 0)
			throw new RuntimeException("Invalid page arguments!");
		if (dataRecordCollection == null || dataRecordCollection.size() < toIndex) {
			GenericDataRecordCollection<IndexedDataRecord> drc = newDataRecordCollection();
			IndexedDataRecord record;
			for (int i=fromIndex; i<toIndex; i++) {
				FastaHit hit = fastout.hits.get(i);
				DatasetId datasetId = new DatasetId(hit.DATASET, hit.PRIMARY_ID);
				record = newDataRecord(i, findDatasetRecord(datasetId));
				record.getField(RecordFieldType.SCORE).setValue(hit.ZSCORE);
				record.getField(RecordFieldType.E_VALUE).setValue(hit.E_VALUE);
				record.getField(RecordFieldType.DATASET).setValue(datasetId.dataset);
				record.getField(RecordFieldType.QUERY).setValue(fastout.QUERY);
				drc.add(record);
			}
			return drc;
		}
		return dataRecordCollection.slice(fromIndex, toIndex);
	}
}
