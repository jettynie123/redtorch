package xyz.redtorch.desktop.service;

import xyz.redtorch.pb.CoreField.*;

import java.util.List;

public interface DesktopTradeCachesService {
    List<OrderField> getOrderList();

    List<OrderField> getWorkingOrderList();

    OrderField queryOrderByOrderId(String orderId);

    OrderField queryOrderByOriginOrderId(String originOrderId);

    List<OrderField> queryOrderListByAccountId(String accountId);

    List<OrderField> queryOrderListByUniformSymbol(String uniformSymbol);

    List<TradeField> getTradeList();

    TradeField queryTradeByTradeId(String tradeId);

    List<TradeField> queryTradeListByUniformSymbol(String uniformSymbol);

    List<TradeField> queryTradeListByAccountId(String accountId);

    List<TradeField> queryTradeListByOrderId(String orderId);

    List<TradeField> queryTradeListByOriginOrderId(String originOrderId);

    List<PositionField> getPositionList();

    PositionField queryPositionByPositionId(String positionId);

    List<PositionField> queryPositionListByAccountId(String accountId);

    List<PositionField> queryPositionListByUniformSymbol(String uniformSymbol);

    List<AccountField> getAccountList();

    AccountField queryAccountByAccountId(String accountId);

    List<AccountField> queryAccountListByAccountCode(String accountCode);

    List<ContractField> getContractList();

    ContractField queryContractByUniformSymbol(String uniformSymbol);

    List<ContractField> getMixContractList();

    List<TickField> getTickList();

    List<TickField> getMixTickList();

    TickField queryTickByUniformSymbol(String uniformSymbol);
    // ------------------------------------------------------------

    void cacheOrder(OrderField order);

    void cacheTrade(TradeField trade);

    void cacheContract(ContractField contract);

    void cachePosition(PositionField position);

    void cacheAccount(AccountField account);

    void cacheTick(TickField tick);

    void cacheOrderList(List<OrderField> orderList);

    void cacheTradeList(List<TradeField> tradeList);

    void cacheContractList(List<ContractField> contractList);

    void cachePositionList(List<PositionField> positionList);

    void cacheAccountList(List<AccountField> accountList);

    void cacheTickList(List<TickField> tickList);

    // ------------------------------------------------------------

    void clearAndCacheOrderList(List<OrderField> orderList);

    void clearAndCacheTradeList(List<TradeField> tradeList);

    void clearAndCacheContractList(List<ContractField> contractList);

    void clearAndCachePositionList(List<PositionField> positionList);

    void clearAndCacheAccountList(List<AccountField> accountList);

    void clearAndCacheTickList(List<TickField> tickList);

    void reloadData();

}
