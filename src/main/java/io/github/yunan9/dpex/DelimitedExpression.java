package io.github.yunan9.dpex;

import io.github.yunan9.dpex.configuration.DelimitedExpressionConfiguration;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public sealed interface DelimitedExpression permits DelimitedExpressionImpl {

  @Contract(value = "_ -> new", pure = true)
  static @NotNull DelimitedExpression newDelimitedExpression(
      final @NotNull DelimitedExpressionConfiguration configuration) {
    return new DelimitedExpressionImpl(configuration);
  }

  @NotNull
  DelimitedExpressionConfiguration getConfiguration();
}
