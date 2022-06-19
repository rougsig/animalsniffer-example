package com.example

import groovy.transform.CompileDynamic
import java.nio.file.Path

@CompileDynamic
class Dynamic {
  def foo() {
    // From Path.of JavaDoc
    // @since 11
    System.out.println(Path.of("Hello World"));
  }
}
