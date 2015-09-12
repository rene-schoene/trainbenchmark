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

package hu.bme.mit.trainbenchmark.generator.sql;

import hu.bme.mit.trainbenchmark.generator.GeneratorFactory;
import hu.bme.mit.trainbenchmark.generator.ModelGenerator;
import hu.bme.mit.trainbenchmark.generator.sql.config.SQLGeneratorConfig;

public class SQLGeneratorMain {

	public static void main(final String[] args) throws Exception {
		final SQLGeneratorConfig sqlGeneratorConfig = new SQLGeneratorConfig(args);
		final SQLSerializer sqlSerializer = new SQLSerializer(sqlGeneratorConfig);
		final ModelGenerator generator = GeneratorFactory.createGenerator(sqlSerializer, sqlGeneratorConfig);
		generator.generateModel();
	}

}
