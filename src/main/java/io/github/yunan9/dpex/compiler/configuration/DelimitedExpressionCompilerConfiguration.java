package io.github.yunan9.dpex.compiler.configuration;

import static io.github.yunan9.dpex.compiler.configuration.DelimitedExpressionCompilerConfigurationImpl.*;

import io.github.yunan9.commons.build.Buildable;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public sealed interface DelimitedExpressionCompilerConfiguration
    permits DelimitedExpressionCompilerConfigurationImpl {

  @Contract(value = " -> new", pure = true)
  static @NotNull Builder newBuilder() {
    return new BuilderImpl();
  }

  sealed interface Builder extends Buildable<@NotNull DelimitedExpressionCompilerConfiguration>
      permits BuilderImpl {

    @Override
    @NotNull
    DelimitedExpressionCompilerConfiguration build();
  }
}
