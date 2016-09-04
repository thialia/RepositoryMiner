package org.repositoryminer.persistence.handler;

import org.repositoryminer.persistence.Connection;

public class TagAnalysisDocumentHandler extends DocumentHandler{

	private static final String COLLECTION_NAME = "rm_tags_analysis";
	
	public TagAnalysisDocumentHandler() {
		super.collection = Connection.getInstance().getCollection(COLLECTION_NAME);
	}
	
}