package cn.coconut.waveband.props;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author coconut
 */
@Data
@Component
@ConfigurationProperties(prefix = "stock.api")
public class ApiProperties {

    private String url;


}
