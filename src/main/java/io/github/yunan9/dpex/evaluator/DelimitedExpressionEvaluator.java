package io.github.yunan9.dpex.evaluator;

import io.github.yunan9.dpex.evaluator.context.DelimitedExpressionEvaluatorContext;
import org.jetbrains.annotations.NotNull;

@FunctionalInterface
public interface DelimitedExpressionEvaluator<T> {

  T evaluateDelimitedExpression(final @NotNull DelimitedExpressionEvaluatorContext context);
}
