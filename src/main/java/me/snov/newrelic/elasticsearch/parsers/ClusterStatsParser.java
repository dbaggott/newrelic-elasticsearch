package me.snov.newrelic.elasticsearch.parsers;

import me.snov.newrelic.elasticsearch.responses.ClusterStats;

import java.net.MalformedURLException;
import java.net.URL;

public class ClusterStatsParser extends AbstractParser<ClusterStats> {

    private static final String URL_CLUSTER_STATS = "/_cluster/stats";

    public ClusterStatsParser() {
        super(ClusterStats.class, null, null, null);
    }

    public ClusterStatsParser(String host, int port, String username, String password) throws MalformedURLException {
        super(ClusterStats.class, new URL(HTTP, host, port, URL_CLUSTER_STATS), username, password);
    }
}
