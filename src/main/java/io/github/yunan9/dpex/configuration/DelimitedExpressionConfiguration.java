package io.github.yunan9.dpex.configuration;

import static io.github.yunan9.dpex.configuration.DelimitedExpressionConfigurationImpl.*;

import io.github.yunan9.commons.build.Buildable;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public sealed interface DelimitedExpressionConfiguration
    permits DelimitedExpressionConfigurationImpl {

  @Contract(value = " -> new", pure = true)
  static @NotNull Builder newBuilder() {
    return new BuilderImpl();
  }

  sealed interface Builder extends Buildable<@NotNull DelimitedExpressionConfiguration>
      permits BuilderImpl {

    @Override
    @NotNull
    DelimitedExpressionConfiguration build();
  }
}
