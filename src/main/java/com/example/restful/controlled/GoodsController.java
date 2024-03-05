package com.example.restful.controlled;

import com.example.restful.pojo.Goods;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/goods")
public class GoodsController {

    @PostMapping("")
    public String addUser(@RequestBody Goods goods){
        System.out.println("新增商品信息："+goods);
        return "新增商品成功！";
    }
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id){
        System.out.println("删除商品id:"+id);
        return "删除商品成功！";
    }

    @PutMapping("")
    public String updateUser(@RequestBody Goods goods){
        System.out.println("修改后的商品信息："+goods);
        return "修改商品成功！";
    }

    @GetMapping("/{id}")
    public String getUser(@PathVariable int id){
        System.out.println("查找商品信息id:"+id);
        return "查找商品id成功！";
    }

    @GetMapping("")
    public String getUsers(){
        System.out.println("查找所有的商品");
        return "查找所有商品成功！";
    }
}
