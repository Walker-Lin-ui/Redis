package com.xzit.service;

import com.xzit.dto.Result;
import com.xzit.entity.VoucherOrder;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 虎哥
 * @since 2021-12-22
 */
public interface IVoucherOrderService extends IService<VoucherOrder> {

     /*Result createVoucherOrder(Long voucherId) ;*/



    Result seckillVoucher(Long voucherId);
}
