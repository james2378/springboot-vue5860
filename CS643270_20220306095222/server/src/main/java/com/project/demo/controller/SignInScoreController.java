package com.project.demo.controller;

import com.project.demo.entity.SignInScore;
import com.project.demo.service.SignInScoreService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 *签收评分：(SignInScore)表控制层
 *
 */
@RestController
@RequestMapping("/sign_in_score")
public class SignInScoreController extends BaseController<SignInScore,SignInScoreService> {

    /**
     *签收评分对象
     */
    @Autowired
    public SignInScoreController(SignInScoreService service) {
        setService(service);
    }

    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        return success(1);
    }

}
