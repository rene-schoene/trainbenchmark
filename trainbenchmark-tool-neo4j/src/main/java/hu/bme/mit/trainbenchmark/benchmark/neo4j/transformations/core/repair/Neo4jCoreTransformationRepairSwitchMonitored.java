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
package hu.bme.mit.trainbenchmark.benchmark.neo4j.transformations.core.repair;

import java.util.Collection;

import org.neo4j.graphdb.Node;

import hu.bme.mit.trainbenchmark.benchmark.neo4j.driver.Neo4jDriver;
import hu.bme.mit.trainbenchmark.benchmark.neo4j.matches.Neo4jSwitchMonitoredMatch;
import hu.bme.mit.trainbenchmark.benchmark.neo4j.transformations.Neo4jCoreTransformation;
import hu.bme.mit.trainbenchmark.neo4j.Neo4jConstants;

public class Neo4jCoreTransformationRepairSwitchMonitored extends Neo4jCoreTransformation<Neo4jSwitchMonitoredMatch> {

	public Neo4jCoreTransformationRepairSwitchMonitored(final Neo4jDriver driver) {
		super(driver);
	}

	@Override
	public void activate(final Collection<Neo4jSwitchMonitoredMatch> matches) {
		for (final Neo4jSwitchMonitoredMatch ssnm : matches) {
			final Node sw = ssnm.getSw();
			final Node sensor = driver.getGraphDb().createNode(Neo4jConstants.labelSensor);
			sw.createRelationshipTo(sensor, Neo4jConstants.relationshipTypeMonitoredBy);
		}
	}

}
