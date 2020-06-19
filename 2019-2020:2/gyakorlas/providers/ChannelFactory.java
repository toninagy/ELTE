package tv.providers;

import tv.Channel;

import java.util.HashMap;
import java.util.Map;

public final class ChannelFactory {

    private static final Map<Provider, Channel> CHANNEL_PROVIDERS = new HashMap<>();

    public enum Provider {
        HBO, SHOWTIME, STARZ
    }

    public static Channel getChannel(Provider provider) {
        if (CHANNEL_PROVIDERS.isEmpty()) {
            CHANNEL_PROVIDERS.put(Provider.HBO, new HBO());
            CHANNEL_PROVIDERS.put(Provider.SHOWTIME, new Showtime());
            CHANNEL_PROVIDERS.put(Provider.STARZ, new Starz());
        }
        return CHANNEL_PROVIDERS.get(provider);
    }
}
