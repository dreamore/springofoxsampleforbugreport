package ru.dreamore.sample.springfoxsample1;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PreAuthorize("SOME_USER")
@Api(
    tags = {
        "Public API"
    }
)
public class SimpleController {

    @ApiOperation(value = "Simple API method")
    @GetMapping(path = "/public/api/simple")
    public String getSimple(
        CustomAuthentication auth,
        @ApiParam(name = "simple request attribute", value = "simple", required = false, example = "Simple string")
        @RequestAttribute(name = "simple", required = false) String simple
    ) {
        return "Simple";
    }
}
