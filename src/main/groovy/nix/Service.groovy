package nix

import groovy.util.logging.Slf4j
import javax.inject.Inject
import com.github.dockerjava.api.DockerClient

/**
 * Service responsible to send Docker events to message broker
 *
 * @since 0.1.0
 */
@Slf4j
class Service {

  /**
   * Instance to deal with Docker instance
   *
   * @since 0.1.0
   */
  @Inject
  DockerClient dockerClient

  /**
   *
   * @since 0.1.0
   */
  @Inject
  DockerEventsPublisher publisher

  void listen() {
    dockerClient.eventsCmd().exec(publisher).awaitCompletion().close()
  }
}
