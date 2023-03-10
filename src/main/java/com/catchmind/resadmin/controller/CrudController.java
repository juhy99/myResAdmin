package com.catchmind.resadmin.controller;

import com.catchmind.resadmin.ifs.CrudInterface;
import com.catchmind.resadmin.model.network.Header;
import org.springframework.stereotype.Component;

@Component      //기본적으로 타입기반의 자동주입 어노테이션(Autowired 비슷한 기능)
public abstract class CrudController<Req, Res, Entity> implements CrudInterface<Req, Res> {
    @Override
    public Header<Res> create(Header<Req> request) {
        return null;
    }

    @Override
    public Header<Res> read(Long id) {
        return null;
    }

    @Override
    public Header<Res> update(Header<Req> request) {
        return null;
    }

    @Override
    public Header<Res> delete(Long id) {
        return null;
    }
}
