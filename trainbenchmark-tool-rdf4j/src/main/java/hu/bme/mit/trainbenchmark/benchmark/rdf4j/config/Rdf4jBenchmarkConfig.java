/*******************************************************************************
 * Copyright (c) 2010-2015, Benedek Izso, Gabor Szarnyas, Istvan Rath and Daniel Varro
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Benedek Izso - initial API and implementation
 *   Gabor Szarnyas - initial API and implementation
 *******************************************************************************/

package hu.bme.mit.trainbenchmark.benchmark.rdf4j.config;

import hu.bme.mit.trainbenchmark.benchmark.config.BenchmarkConfigBase;
import hu.bme.mit.trainbenchmark.benchmark.rdf.config.RdfBenchmarkConfig;

public class Rdf4jBenchmarkConfig extends RdfBenchmarkConfig {

	protected Rdf4jBenchmarkConfig() {
	}
	
	public Rdf4jBenchmarkConfig(final BenchmarkConfigBase bcb, final boolean inferencing) {
		super(bcb, inferencing);
	}
	
	@Override
	public String getToolName() {
		return "RDF4J" + getToolNamePostfix();
	}

	@Override
	public String getProjectName() {
		return "rdf4j";
	}
	
}
