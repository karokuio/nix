package nix

import groovy.util.logging.Slf4j
import groovy.json.JsonOutput
import javax.inject.Inject
import java.nio.file.Files
import java.nio.file.Paths
import com.github.dockerjava.api.DockerClient
import com.github.dockerjava.core.command.BuildImageResultCallback
import com.github.dockerjava.api.model.BuildResponseItem
import org.zeroturnaround.zip.ZipUtil

import pluto.events.Publisher
import pluto.util.Storage

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
