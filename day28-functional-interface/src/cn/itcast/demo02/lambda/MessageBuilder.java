package cn.itcast.demo02.lambda;

@FunctionalInterface
public interface MessageBuilder {
    public abstract String buildMessage();
}
