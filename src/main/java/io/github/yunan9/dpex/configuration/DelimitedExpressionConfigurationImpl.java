package io.github.yunan9.dpex.configuration;

import io.github.yunan9.pointer.store.PointerStore;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

final class DelimitedExpressionConfigurationImpl implements DelimitedExpressionConfiguration {

  private final PointerStore pointerStore;

  DelimitedExpressionConfigurationImpl(
      final @NotNull PointerStore pointerStore, final @NotNull BuilderImpl builder) {
    this.pointerStore = pointerStore;

    this.pointerStore.registerPointer(ID_POINTER_KEY, () -> builder.id);
    this.pointerStore.registerPointer(
        OPENING_DELIMITER_POINTER_KEY, () -> builder.openingDelimiter);
    this.pointerStore.registerPointer(
        CLOSING_DELIMITER_POINTER_KEY, () -> builder.closingDelimiter);
  }

  @Override
  public @NotNull PointerStore getPointerStore() {
    return this.pointerStore;
  }

  @ApiStatus.Internal
  static final class BuilderImpl implements Builder {

    private PointerStore pointerStore;

    private String id, openingDelimiter, closingDelimiter;

    @Override
    public @NotNull Builder pointerStore(final @NotNull PointerStore pointerStore) {
      this.pointerStore = pointerStore;
      return this;
    }

    @Override
    public @NotNull Builder id(final @NotNull String id) {
      this.id = id;
      return this;
    }

    @Override
    public @NotNull Builder openingDelimiter(final @NotNull String openingDelimiter) {
      this.openingDelimiter = openingDelimiter;
      return this;
    }

    @Override
    public @NotNull Builder closingDelimiter(final @NotNull String closingDelimiter) {
      this.closingDelimiter = closingDelimiter;
      return this;
    }

    @Override
    public @NotNull DelimitedExpressionConfiguration build() {
      return new DelimitedExpressionConfigurationImpl(this.pointerStore, this);
    }
  }
}
