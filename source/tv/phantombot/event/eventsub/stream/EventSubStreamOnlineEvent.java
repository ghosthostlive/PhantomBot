/*
 * Copyright (C) 2016-2023 phantombot.github.io/PhantomBot
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package tv.phantombot.event.eventsub.stream;

import com.gmt2001.twitch.eventsub.subscriptions.stream.StreamOnline;

/**
 * A broadcaster has started a stream
 *
 * @author gmt2001
 */
public class EventSubStreamOnlineEvent extends EventSubStreamEvent<StreamOnline> {
    public EventSubStreamOnlineEvent(StreamOnline event) {
        super(event);
    }
}
