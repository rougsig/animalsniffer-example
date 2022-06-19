package com.example

import java.nio.file.Path

class Default {
  def foo() {
    // From Path.of JavaDoc
    // @since 11
    System.out.println(Path.of("Hello World"));
  }
}
