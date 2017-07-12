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
 * Service responsible to hold the logic on how to create and remove
 * templates images from Docker
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
   * Worker specific configuration
   *
   * @since 0.1.0
   */
  @Inject
  Config config

  /**
   * Pluto's configured publisher
   *
   * @since 0.1.0
   */
  @Inject
  Publisher publisher


}
