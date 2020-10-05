package leaders.tech.join.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("about")
@EnableSwagger2
public class AboutController {

    @Value("${application.name}")
    private String applicationName;

    @Value("${build.version}")
    private String buildVersion;

    private Map<String, String> _about = new HashMap<>();

    @GetMapping
    public Map<String, String> getAbout() {
        _about.put("name", applicationName);
        _about.put("version", buildVersion);

        return _about;
    }
}
