/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or http://www.gnu.org/licenses/lgpl-2.1.html
 */
package org.hibernate.query.sqm.tree.expression.function;

import java.util.function.Supplier;

import org.hibernate.metamodel.model.domain.spi.AllowableFunctionReturnType;
import org.hibernate.query.sqm.tree.expression.SqmExpression;

/**
 * @author Steve Ebersole
 */
public interface SqmFunction extends SqmExpression {
	String getFunctionName();

	@Override
	AllowableFunctionReturnType getExpressableType();

	@Override
	Supplier<? extends AllowableFunctionReturnType> getInferableType();

	boolean hasArguments();
}