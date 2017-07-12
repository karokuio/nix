package nix

import javax.inject.Inject
import pluto.events.Publisher
import com.github.dockerjava.api.model.Event
import com.github.dockerjava.core.command.EventsResultCallback

class DockerEventsPublisher extends EventsResultCallback {

  @Inject
  Publisher publisher

  @Override
  void onNext(Event event) {
    publisher.publish('docker.event', event)
    super.onNext(event);
  }
}
