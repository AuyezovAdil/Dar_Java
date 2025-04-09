package kz.dar.post.config;

import org.elasticsearch.client.RestClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration;

import java.io.IOException;

@Configuration

public class ElasticConfig extends AbstractElasticsearchConfiguration {
    @Override
    public RestHighLevelClient elasticsearchClient() {
        ClientConfiguration clientConfiguration = ClientConfiguration.builder()
                .connectedTo("hometask-java.es.us-central1.gcp.cloud.es.io")
                .usingSsl()
                .withBasicAuth("elastic", "Rz352XSqIrnQxJlp6rwSLlaU")
                .build();
        return RestClients.create(clientConfiguration).rest();
    }

}
