package nextstep.subway.station.dto;

import nextstep.subway.station.domain.Station;

public class StationRequest {
    private String name;

    public String getName() {
        return name;
    }

    public Station toStation() {
        return new Station(name);
    }

    @Override
    public String
    toString() {
        return "StationRequest{" +
                "name='" + name + '\'' +
                '}';
    }
}
