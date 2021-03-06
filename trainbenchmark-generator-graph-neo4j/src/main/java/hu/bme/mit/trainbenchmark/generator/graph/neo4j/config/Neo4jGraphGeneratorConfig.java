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

package hu.bme.mit.trainbenchmark.generator.graph.neo4j.config;

import hu.bme.mit.trainbenchmark.generator.config.GeneratorConfig;
import hu.bme.mit.trainbenchmark.generator.config.GeneratorConfigBase;
import hu.bme.mit.trainbenchmark.neo4j.config.Neo4jGraphFormat;

public class Neo4jGraphGeneratorConfig extends GeneratorConfig {

	protected Neo4jGraphFormat graphFormat;

	protected Neo4jGraphGeneratorConfig(final GeneratorConfigBase configBase, final Neo4jGraphFormat graphFormat) {
		super(configBase);
		this.graphFormat = graphFormat;
	}

	public Neo4jGraphFormat getGraphFormat() {
		return graphFormat;
	}

	@Override
	public String getProjectName() {
		return "graph-neo4j";
	}

}
