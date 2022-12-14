package com.olinonee.framework.lock.service;

/**
 * 库存业务 接口（事务模式）
 *
 * @author olinH, olinone666@gmail.com
 * @version v1.0.0
 * @since 2022-09-13
 */
public interface ITransactionalDbLockStockService {

    /**
     * 使用数据库锁（原子性，行锁或者表锁）减库存
     */
    void deductWithDbLock();

    /**
     * 使用 select ... for update 更新减库存，悲观锁（行级锁）
     */
    void deductWithDbLockForUpdate();
}
