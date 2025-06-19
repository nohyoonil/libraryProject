package com.group.libraryapp.domain.loanhistory;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\u0015\u001a\u00020\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0017"}, d2 = {"Lcom/group/libraryapp/domain/loanhistory/UserLoanHistory;", "", "user", "Lcom/group/libraryapp/domain/user/User;", "bookName", "", "isReturn", "", "id", "", "(Lcom/group/libraryapp/domain/user/User;Ljava/lang/String;ZLjava/lang/Long;)V", "getBookName", "()Ljava/lang/String;", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "()Z", "setReturn", "(Z)V", "getUser", "()Lcom/group/libraryapp/domain/user/User;", "doReturn", "", "library-app"})
@javax.persistence.Entity
public final class UserLoanHistory {
    @org.jetbrains.annotations.NotNull
    @javax.persistence.ManyToOne
    private final com.group.libraryapp.domain.user.User user = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String bookName = null;
    private boolean isReturn;
    @org.jetbrains.annotations.Nullable
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @javax.persistence.Id
    private final java.lang.Long id = null;
    
    public UserLoanHistory(@org.jetbrains.annotations.NotNull
    com.group.libraryapp.domain.user.User user, @org.jetbrains.annotations.NotNull
    java.lang.String bookName, boolean isReturn, @org.jetbrains.annotations.Nullable
    java.lang.Long id) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.group.libraryapp.domain.user.User getUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBookName() {
        return null;
    }
    
    public final boolean isReturn() {
        return false;
    }
    
    public final void setReturn(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getId() {
        return null;
    }
    
    public final void doReturn() {
    }
}