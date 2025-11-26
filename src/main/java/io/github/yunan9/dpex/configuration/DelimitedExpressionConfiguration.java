package io.github.yunan9.dpex.configuration;

import static io.github.yunan9.dpex.configuration.DelimitedExpressionConfigurationImpl.*;
import static io.github.yunan9.pointer.key.PointerKey.newPointerKey;

import io.github.yunan9.commons.build.Buildable;
import io.github.yunan9.pointer.key.PointerKey;
import io.github.yunan9.pointer.store.PointerStore;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public sealed interface DelimitedExpressionConfiguration extends PointerStore.Holder
    permits DelimitedExpressionConfigurationImpl {

  Class<String> STRING_CLASS = String.class;

  PointerKey<String> ID_POINTER_KEY = newPointerKey("id", STRING_CLASS),
      OPENING_DELIMITER_POINTER_KEY = newPointerKey("opening-delimiter", STRING_CLASS),
      CLOSING_DELIMITER_POINTER_KEY = newPointerKey("closing-delimiter", STRING_CLASS);

  @Contract(value = " -> new", pure = true)
  static @NotNull Builder newBuilder() {
    return new BuilderImpl();
  }

  @Override
  @NotNull
  PointerStore getPointerStore();

  sealed interface Builder extends Buildable<@NotNull DelimitedExpressionConfiguration>
      permits BuilderImpl {

    @NotNull
    Builder pointerStore(final @NotNull PointerStore pointerStore);

    @NotNull
    Builder id(final @NotNull String id);

    @NotNull
    Builder openingDelimiter(final @NotNull String openingDelimiter);

    @NotNull
    Builder closingDelimiter(final @NotNull String closingDelimiter);

    @Override
    @NotNull
    DelimitedExpressionConfiguration build();
  }
}
