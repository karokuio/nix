package nix

import com.google.inject.Guice

/**
 * Worker's application
 *
 * @since 0.1.0
 */
class Application {

  /**
   * Worker's main entry point
   *
   * @since 0.1.0
   */
  static void main(args) {
    Guice.createInjector(new Module()).getInstance(Service).listen()
  }
}
