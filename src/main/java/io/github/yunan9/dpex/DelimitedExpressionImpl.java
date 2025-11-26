package io.github.yunan9.dpex;

import io.github.yunan9.dpex.configuration.DelimitedExpressionConfiguration;
import org.jetbrains.annotations.NotNull;

final class DelimitedExpressionImpl implements DelimitedExpression {

  private final DelimitedExpressionConfiguration configuration;

  DelimitedExpressionImpl(final @NotNull DelimitedExpressionConfiguration configuration) {
    this.configuration = configuration;
  }

  @Override
  public @NotNull DelimitedExpressionConfiguration getConfiguration() {
    return this.configuration;
  }
}
