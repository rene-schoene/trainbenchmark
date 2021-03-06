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
package hu.bme.mit.trainbenchmark.benchmark.sesame.comparators;

import java.util.Comparator;

import org.openrdf.model.URI;

public class UriComparator implements Comparator<URI> {

	@Override
	public int compare(final URI uri1, final URI uri2) {
		final long id1 = Long.parseLong(uri1.getLocalName().substring(1));
		final long id2 = Long.parseLong(uri2.getLocalName().substring(1));
		return Long.compare(id1, id2);
	}

}
