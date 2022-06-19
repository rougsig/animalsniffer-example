package com.example

import groovy.transform.CompileDynamic

import java.nio.file.Files
import java.nio.file.Path

@CompileDynamic
class Java12 {
  def foo() {
    // From Files.mismatch JavaDoc
    // @since 12
    Files.mismatch(Path.of("Hello"), Path.of("World"))
  }
}
