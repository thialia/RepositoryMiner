package org.repositoryminer.scm;

import org.repositoryminer.domain.SCMType;

public class SCMFactory {

	public static ISCM getSCM(SCMType id) {
		switch (id) {
		case GIT:
			return new GitSCM();
		default:
			return null;
		}
	}

}
