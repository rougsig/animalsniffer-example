package com.example

import groovy.transform.CompileStatic
import java.nio.file.Path

@CompileStatic
class Static {
  def foo() {
    // From Path.of JavaDoc
    // @since 11
    System.out.println(Path.of("Hello World"));
  }
}
