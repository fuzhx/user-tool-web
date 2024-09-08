package com.zx.app.tool.ctrl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ctrl/tool/common")
public class ToolCommonCtrl {


    /**
     * <p>/ctrl/tool/common/helloWorld</p>
     *
     * @return
     */
    @GetMapping("helloWorld")
    public String helloWorld() {
        return "Hello World:" + Long.toString(System.currentTimeMillis());
    }

}
