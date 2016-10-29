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

package hu.bme.mit.trainbenchmark.generator;

import hu.bme.mit.trainbenchmark.generator.config.GeneratorConfig;
import hu.bme.mit.trainbenchmark.generator.scalable.ScalableModelGenerator;

public class ScalableGeneratorFactory {

	public static <TGeneratorConfig extends GeneratorConfig> ModelGenerator createGenerator(
			final ModelSerializer<TGeneratorConfig> serializer, final TGeneratorConfig generatorConfig) {
		return new ScalableModelGenerator(serializer, generatorConfig);
	}

}
