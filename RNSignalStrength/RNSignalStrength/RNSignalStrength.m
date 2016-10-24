//
//  RNSignalStrength.m
//  RNSignalStrength
//
//  Created by Leanid Vouk on 10/23/16.
//
//

#import "RCTBridge.h"
#import "RNSignalStrength.h"

@implementation RNSignalStrength

@synthesize bridge = _bridge;

RCT_EXPORT_MODULE()

- (id) init {
    self = [super init];
    NSLog(@"RNSignalStrength");
    
    return self;
}

- (dispatch_queue_t)methodQueue
{
    return dispatch_get_main_queue();
}


- (NSDictionary *)constantsToExport
{
    return @{
             @"signal": @"1",
             @"hello": @"world",
             };
}

RCT_EXPORT_METHOD(addEvent:(NSString *)name location:(NSString *)location)
{
    NSLog(@"Pretending to create an event %@ at %@", name, location);
}

@end
