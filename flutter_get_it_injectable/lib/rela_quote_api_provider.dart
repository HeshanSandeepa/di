import 'package:flutter_get_it_injectable/quote.dart';
import 'package:injectable/injectable.dart';

import 'mock_quote_api_provider.dart';

@Named("prod")
@Singleton(as: QuoteApiProvider)
class RealQuoteApiProvider implements QuoteApiProvider {
  const RealQuoteApiProvider();
  @override
  Future<List<Quote>> getQuotes(String env) async {
    //add some delay to give the feel of api call
    await Future.delayed(const Duration(seconds: 3));
    return Future.value([
      Quote(
          quote: "Simplicity is a great virtue from production.",
          author: "Edsger Wybe Dijkstra",
          lang: '',
          tags: []),
      Quote(
          quote: "Progress and don't look back.",
          author: "Michael Nielsen",
          lang: '',
          tags: [])
    ]);
  }
}
