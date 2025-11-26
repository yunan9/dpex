package io.github.yunan9.dpex.evaluator.context;

import io.github.yunan9.pointer.store.PointerStore;
import org.jetbrains.annotations.NotNull;

final class DelimitedExpressionEvaluatorContextImpl implements DelimitedExpressionEvaluatorContext {

  private final PointerStore pointerStore;

  DelimitedExpressionEvaluatorContextImpl(final @NotNull PointerStore pointerStore) {
    this.pointerStore = pointerStore;
  }

  @Override
  public @NotNull PointerStore getPointerStore() {
    return this.pointerStore;
  }
}
