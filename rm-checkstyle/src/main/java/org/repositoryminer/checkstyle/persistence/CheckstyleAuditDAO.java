package org.repositoryminer.checkstyle.persistence;

import org.bson.Document;
import org.bson.conversions.Bson;
import org.repositoryminer.persistence.dao.GenericDAO;

import com.mongodb.BasicDBObject;
import com.mongodb.client.model.Filters;

public class CheckstyleAuditDAO extends GenericDAO {

	private static final String COLLECTION_NAME = "checkstyle_audit";

	public CheckstyleAuditDAO() {
		super(COLLECTION_NAME);
	}
	
	public Document findByFile(long filehash, String commit, Bson projection) {
		Bson clause1 = new BasicDBObject("filehash", filehash);
		Bson clause2 = new BasicDBObject("commit", commit);
		return findOne(Filters.and(clause1, clause2), projection);
	}
	
}