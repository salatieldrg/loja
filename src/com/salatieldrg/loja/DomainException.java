package com.salatieldrg.loja;

public class DomainException extends RuntimeException{
    public DomainException(String msgErro){
        super(msgErro);
    }
}
