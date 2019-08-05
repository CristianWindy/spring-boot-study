package com.fengtianle.service;

import com.fengtianle.model.UserDetail;
import com.fengtianle.param.UserDetailParam;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserDetailService {
    public Page<UserDetail> findByCondition(UserDetailParam detailParam, Pageable pageable);
}
