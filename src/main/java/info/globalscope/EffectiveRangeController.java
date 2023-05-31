package info.globalscope;

import io.micronaut.http.annotation.*;

@Controller("/effectiveRange")
public class EffectiveRangeController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}