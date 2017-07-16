package nix

import javax.inject.Inject
import pluto.events.Publisher
import com.github.dockerjava.api.model.Event
import com.github.dockerjava.core.command.EventsResultCallback

/**
 * Callback used by nix to send every Docker event to the message
 * broker
 *
 * @since 0.1.0
 */
class DockerEventsPublisher extends EventsResultCallback {

  /**
   * Broker message publisher instance
   *
   * @since 0.1.0
   */
  @Inject
  Publisher publisher

  @Override
  void onNext(Event event) {
    publisher.publish(Events.DOCKER, event)
    super.onNext(event);
  }
}
