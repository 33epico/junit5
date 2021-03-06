/*
 * Copyright 2015-2016 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.junit.jupiter.migrationsupport.rules.adapter;

import static org.junit.platform.commons.meta.API.Usage.Internal;

import org.junit.jupiter.migrationsupport.rules.member.RuleAnnotatedMember;
import org.junit.platform.commons.meta.API;
import org.junit.rules.Verifier;

@API(Internal)
public class VerifierAdapter extends AbstractTestRuleAdapter {

	public VerifierAdapter(RuleAnnotatedMember annotatedMember) {
		super(annotatedMember, Verifier.class);
	}

	@Override
	public void after() {
		super.executeMethod("verify");
	}

}
