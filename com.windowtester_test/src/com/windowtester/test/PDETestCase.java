package com.windowtester.test;

import org.eclipse.core.runtime.Platform;

import junit.framework.TestCase;

/*******************************************************************************
 *  Copyright (c) 2012 Google, Inc.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *  Google, Inc. - initial API and implementation
 *******************************************************************************/
public class PDETestCase extends TestCase implements IPDETestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		assertTrue("This test must be run as a PDE test", Platform.isRunning());
	}
	
	
}
