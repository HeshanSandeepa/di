import 'package:injectable/injectable.dart';

abstract class QuoteApiProvider {
  const QuoteApiProvider();
  Future<List> getQuotes(String env);
}


@Singleton(as: QuoteApiProvider)
class MockQuoteApiProvider implements QuoteApiProvider {
  const MockQuoteApiProvider();
  @override
  Future<List> getQuotes(String env) async {
    //add some delay to give the feel of api call
    await Future.delayed(const Duration(seconds: 3));
    return Future.value([
      {
        "quote": "Simplicity is a great virtue.",
        "author": "Edsger Wybe Dijkstra"
      },
      {"quote": "Progress and don't look back.", "author": "Michael Nielsen"}
    ]);
  }
}
